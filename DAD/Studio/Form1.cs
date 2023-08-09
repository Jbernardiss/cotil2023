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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            menuStrip1.Visible = false;

            if (DAO_Conexao.getConexao("143.106.241.3", "cl202232", "cl202232", "Th30n3Wh0Kn0ck$"))
            {
                Console.WriteLine("Connectado");
            }
            else
            {
                Console.WriteLine("Erro de conexão");
            }
        }

        private void cadastrarLoginToolStripMenuItem_Click(object sender, EventArgs e)
        {
            CadLogin cadLogin = new CadLogin();
            cadLogin.MdiParent = this;
            cadLogin.Show();
        }

        private void button1_Click(object sender, EventArgs e)
        {

            if (DAO_Conexao.loginExiste(textBox1.Text, textBox2.Text))
            {
                MessageBox.Show("Login com sucesso");
                menuStrip1.Visible = true;
                groupBox1.Visible = false;
            }
            else
            {
                MessageBox.Show("Não");
            }
        }
    }
}
