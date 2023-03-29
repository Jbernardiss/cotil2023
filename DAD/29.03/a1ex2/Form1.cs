using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace a1ex2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void fechar_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            textBox1.Text = "Visual Studio 2019";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Campo Obrigatório", "Atenção", MessageBoxButtons.OK, MessageBoxIcon.Warning);
        }

        private void button4_Click(object sender, EventArgs e)
        {
            DialogResult bolinha = MessageBox.Show("Tem certeza que deseja apertar?", "Pergunta", MessageBoxButtons.YesNo, MessageBoxIcon.Question);

            if (bolinha == DialogResult.Yes)
            {
                MessageBox.Show("Apertou Sim", "Bruh");
            } else
            {
                MessageBox.Show("Apertou Não", "Bruh");
            }
        }

        private void Form1_FormClosing(object sender, FormClosingEventArgs e)
        {
            DialogResult bolinha = MessageBox.Show("Você deseja mesmo sair?", "Sair?", MessageBoxButtons.YesNo, MessageBoxIcon.Question);

            if (bolinha == DialogResult.No)
            {
                e.Cancel = true;
            }
        }
    }
}
