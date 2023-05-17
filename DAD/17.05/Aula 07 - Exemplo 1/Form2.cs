using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Text;
using System.Windows.Forms;

namespace Aula_07___Exemplo_1
{
    public partial class Form2 : Form
    {
        int op = 0;
        public Form2()
        {
            InitializeComponent();
        }

        private void monthCalendar1_DateChanged(object sender, DateRangeEventArgs e)
        {
            textBox1.Text = monthCalendar1.SelectionRange.Start.ToString("MM/dd/yyyy");
        }

        private void label6_Click(object sender, EventArgs e)
        {
            op = 6;
        }

        private void label7_Click(object sender, EventArgs e)
        {
            op = 7;
        }

        private void label8_Click(object sender, EventArgs e)
        {
            op = 8;
        }

        private void label9_Click(object sender, EventArgs e)
        {
            op = 9;
        }

        private void label10_Click(object sender, EventArgs e)
        {
            op = 10;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if(op == 6)
            {
                label6.Text = textBox2.Text;
            }else if(op == 7)
            {
                label7.Text = textBox2.Text;
            }else if(op == 8)
            {
                label8.Text = textBox2.Text;
            }else if(op == 9)
            {
                label9.Text = textBox2.Text;
            }else if(op == 10)
            {
                label10.Text = textBox2.Text;
            }
            else
            {
                MessageBox.Show("Escolha um horário");
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            String nome_arq = textBox1.Text = monthCalendar1.SelectionRange.Start.ToString("MM-dd-yyyy");
            StreamWriter arquivo;

            if (System.IO.File.Exists("C:\\Users\\aluno\\3D Objects\\school\\DAD\\17.05\\arquivos_exemplo01\\"))
            {
                File.Delete("C:\\Users\\aluno\\3D Objects\\school\\DAD\\17.05\\arquivos_exemplo01\\" + nome_arq + ".txt");
            }
            arquivo = new StreamWriter("C:\\Users\\aluno\\3D Objects\\school\\DAD\\17.05\\arquivos_exemplo01\\" + nome_arq + ".txt");

            foreach (Label controle in tableLayoutPanel1.Controls)
            {
                arquivo.WriteLine(controle.Text);
            }
            arquivo.Close();

            MessageBox.Show("Arquivo Salvo com sucesso!");
        }

        private void monthCalendar1_DateSelected(object sender, DateRangeEventArgs e)
        {
            String nome_arq = textBox1.Text = monthCalendar1.SelectionRange.Start.ToString("MM-dd-yyyy");
            StreamWriter arquivo;

            if (System.IO.File.Exists("C:\\Users\\aluno\\3D Objects\\school\\DAD\\17.05\\arquivos_exemplo01\\" + nome_arq + ".txt"))
            {

                string[] linhas = File.ReadAllLines("C:\\Users\\aluno\\3D Objects\\school\\DAD\\17.05\\arquivos_exemplo01\\" + nome_arq + ".txt");
                foreach (Label controle in tableLayoutPanel1.Controls)
                {
                    controle.Text = linhas[controle.TabIndex];
                }

            }
        }

        private void Form2_Load(object sender, EventArgs e)
        {

        }
    }
}
