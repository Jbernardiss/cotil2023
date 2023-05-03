using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Padaria
// João Vitor Bernardis
// Matheus Gambaro Guilherme

{
    public partial class Form1 : Form
    {
        int removedItemIndex;
        ArrayList total = new ArrayList();

        static public void atualizaTotal(ArrayList total, Label texto)
        {
            double soma = 0;

            foreach(double f in total)
            {
                soma += f;
            }

            texto.Text = $"{soma}";
        }

        static public bool contemCaracteresAlfabeticos(String valor)
        {
            foreach (char c in valor)
            {
                if (char.IsLetter(c))
                {
                    MessageBox.Show("Caractere não permitido!", "Caracteres não numéricos não são permitidos!", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    return true;
                }
            }

            return false;
        }

        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (String.IsNullOrEmpty(textBox1.Text))
            {
                MessageBox.Show("Campo vazio não permitido!", "Campos vazios não são permitidos!", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return;
            }

            if(contemCaracteresAlfabeticos(textBox2.Text) || String.IsNullOrEmpty(textBox2.Text))
            {
                MessageBox.Show("Caractere não permitido!", "Caracteres não numéricos não são permitidos!", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return;
            }

            if(contemCaracteresAlfabeticos(textBox3.Text) || String.IsNullOrEmpty(textBox3.Text))
            {
                MessageBox.Show("Caractere não permitido!", "Caracteres não numéricos não são permitidos!", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return;
            }

            listBox1.Items.Add(textBox1.Text + " - " + (double.Parse(textBox2.Text) * double.Parse(textBox3.Text)));
            total.Add((double.Parse(textBox2.Text) * double.Parse(textBox3.Text)));

            textBox1.Clear();
            textBox2.Clear();
            textBox3.Clear();
        }

        private void listBox1_DoubleClick(object sender, EventArgs e)
        {
            removedItemIndex = listBox1.Items.IndexOf(listBox1.SelectedItem);
            listBox1.Items.Remove(listBox1.SelectedItem);
            total.RemoveAt(removedItemIndex);
        }

        private void button3_Click(object sender, EventArgs e)
        {
            textBox1.Clear();
            textBox2.Clear();
            textBox3.Clear();
            listBox1.Items.Clear();

            total.Clear();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            atualizaTotal(total, label5);
            MessageBox.Show("Compra efetuada com sucesso!", "Finalização", MessageBoxButtons.OK, MessageBoxIcon.Information);
        }
    }
}
