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
        public Form3()
        {
            InitializeComponent();
        }


        private void txtCPF_KeyPress(object sender, KeyPressEventArgs e)
        {
            Aluno aluno = new Aluno(txtCPF.Text);
            if(e.KeyChar == 13)
            {
                if (aluno.alunoExiste())
                {
                    try
                    {
                        MySqlDataReader dadosAluno = aluno.consultarAluno();

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
                    } 
                    catch(Exception ex)
                    {
                        MessageBox.Show(ex.Message);
                    }
                    
                }
                else
                {
                    txtNome.Focus();
                }
                DAO_Conexao.con.Close();
            }
        }

        private void btnCadastrar_Click(object sender, EventArgs e)
        {
            Aluno aluno = new Aluno(txtCPF.Text, txtNome.Text, txtEndereco.Text, txtNumero.Text, txtBairro.Text, txtComplemento.Text, txtCEP.Text, txtCidade.Text, txtEstado.Text,
                txtTelefone.Text, txtEmail.Text);

            if(aluno.cadastroAluno())
            {
                MessageBox.Show("Cadastro realizado com sucesso!");
            }
            else
            {
                MessageBox.Show("Erro no cadastro.");
            }
        }
    }
}
