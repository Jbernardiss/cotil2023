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
    public partial class Form5 : Form
    {
        MySqlDataReader dadosModalidades;
        public Form5()
        {
            InitializeComponent();

            carregarComboBox();
        }

        private void carregarComboBox()
        {
            dadosModalidades = Modalidade.consultarTodasModalidades();

            comboBoxDescricao.Items.Clear();

            while (dadosModalidades.Read())
            {
                comboBoxDescricao.Items.Add(dadosModalidades["descricaoModalidade"].ToString());
            }
        }


        private void btnCadastrar_Click(object sender, EventArgs e)
        {   
            try
            {
                if(comboBoxDescricao.Text == "")
                {
                    throw new Exception();
                }

                Modalidade modalidade = new Modalidade(comboBoxDescricao.Text, Convert.ToDouble(txtPreco.Text), Convert.ToInt32(txtQtdeAluno.Text), Convert.ToInt32(txtQtdeAula.Text));
                if (modalidade.cadastrarModalidade())
                {
                    MessageBox.Show("Modalidade cadastrada com sucesso");
                }
                else
                {
                    MessageBox.Show("Houve um erro ao cadastrar a modalidade");
                }

                comboBoxDescricao.Text = "";
                txtPreco.Text = "";
                txtQtdeAluno.Text = "";
                txtQtdeAula.Text = "";
            }
            catch(Exception ex)
            {
                MessageBox.Show("Nenhum dos campos pode estar vazio");
            }

            carregarComboBox();
        }

        private void comboBoxDescricao_SelectedIndexChanged(object sender, EventArgs e)
        {


            DAO_Conexao.con.Close();
        }
    }
}
