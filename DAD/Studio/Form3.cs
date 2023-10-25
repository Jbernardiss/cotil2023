using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Studio
{
    public partial class Form3 : Form
    {
        bool alunoExiste = false;

        public Form3()
        {
            InitializeComponent();
        }


        public bool verificaCPF(string CPF) //string CPF - sem parâmetro
        {
            int soma, resto, cont = 0;
            soma = 0;

            CPF = CPF.Trim();
            CPF = CPF.Replace(",", "");
            CPF = CPF.Replace(".", "");
            CPF = CPF.Replace("-", "");

            for (int i = 0; i < CPF.Length; i++)
            {
                int a = CPF[0] - '0';
                int b = CPF[i] - '0';

                if (a == b) cont++;
            }

            if (cont == 11) return false;

            for (int i = 1; i <= 9; i++) soma += int.Parse(CPF.Substring(i - 1, 1)) * (11 - i);

            resto = (soma * 10) % 11;

            if ((resto == 10) || (resto == 11)) resto = 0;

            if (resto != int.Parse(CPF.Substring(9, 1))) return false;

            soma = 0;

            for (int i = 1; i <= 10; i++) soma += int.Parse(CPF.Substring(i - 1, 1)) * (12 - i);

            resto = (soma * 10) % 11;

            if ((resto == 10) || (resto == 11)) resto = 0;

            if (resto != int.Parse(CPF.Substring(10, 1))) return false;

            return true;
        }


        private void txtCPF_KeyPress(object sender, KeyPressEventArgs e)
        {

            if(e.KeyChar == 13)
            {

                Aluno aluno = new Aluno(txtCPF.Text);

                if (verificaCPF(txtCPF.Text))
                {
                    try
                    {


                        MySqlDataReader dadosAluno = aluno.consultarAluno();

                        if (dadosAluno.Read())
                        {
                            MessageBox.Show("Usuário já existe!");

                            txtNome.Text = dadosAluno["nomeAluno"].ToString();
                            txtEndereco.Text = dadosAluno["ruaAluno"].ToString();
                            txtNumero.Text = dadosAluno["numeroAluno"].ToString();
                            txtBairro.Text = dadosAluno["bairroAluno"].ToString();
                            txtComplemento.Text = dadosAluno["complementoAluno"].ToString();
                            txtCEP.Text = dadosAluno["CEPAluno"].ToString();
                            txtCidade.Text = dadosAluno["cidadeAluno"].ToString();
                            txtEstado.Text = dadosAluno["estadoAluno"].ToString();
                            txtTelefone.Text = dadosAluno["telefoneAluno"].ToString();
                            txtEmail.Text = dadosAluno["emailAluno"].ToString();

                            alunoExiste = true;
                            btnCadastrar.Text = "Atualizar";
                        }
                    }
                    catch (Exception ex)
                    {
                        MessageBox.Show(ex.Message);
                    }
                    finally
                    {
                        DAO_Conexao.con.Close();
                    }
                }
                else
                {
                    MessageBox.Show("CPF Inválido");
                }
            }
        }

        private void btnCadastrar_Click(object sender, EventArgs e)
        {
            Aluno aluno = new Aluno(txtCPF.Text, txtNome.Text, txtEndereco.Text, txtNumero.Text, txtBairro.Text, txtComplemento.Text, txtCEP.Text, txtCidade.Text, txtEstado.Text,
                txtTelefone.Text, txtEmail.Text);

            if(alunoExiste == false)
            {
                if (aluno.cadastroAluno())
                {
                    MessageBox.Show("Cadastro realizado com sucesso!");
                }
                else
                {
                    MessageBox.Show("Erro no cadastro.");
                }
            }
            else if(alunoExiste == true) 
            { 
                if(aluno.atualizarAluno())
                {
                    MessageBox.Show("Cadastro atualizado com sucesso!");
                }
                else
                {
                    MessageBox.Show("Erro na atualização.");
                }

                btnCadastrar.Text = "Cadastrar";
            }
            

            txtCPF.Text = "";
            txtNome.Text = "";
            txtEndereco.Text = "";
            txtNumero.Text = "";
            txtBairro.Text = "";
            txtComplemento.Text = "";
            txtCEP.Text = "";
            txtCidade.Text = "";
            txtEstado.Text = "";
            txtTelefone.Text = ""; 
            txtEmail.Text = "";
        }
    }
}
