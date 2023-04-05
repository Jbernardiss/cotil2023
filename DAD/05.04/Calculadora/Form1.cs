using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Calculadora
{
    
    public partial class Form1 : Form
    {
        double num;
        char operacao;
        public Form1()
        {
            InitializeComponent();
        }

        private void button3_Click(object sender, EventArgs e)
        {

        }

        private void button12_Click(object sender, EventArgs e)
        {
            textBox1.Clear();
        }

        private void button13_Click(object sender, EventArgs e)
        {

        }

        private void button11_Click(object sender, EventArgs e)
        {

        }

        private void button14_Click(object sender, EventArgs e)
        {
            operacao = '+';
            num = double.Parse(textBox1.Text);
            textBox1.Clear();

        }

        private void button15_Click(object sender, EventArgs e)
        {
            operacao = '*';
            num = double.Parse(textBox1.Text);
            textBox1.Clear();
        }

        private void button16_Click(object sender, EventArgs e)
        {
            operacao = '*';
            num = double.Parse(textBox1.Text);
            textBox1.Clear();
        }

        private void button17_Click(object sender, EventArgs e)
        {
            operacao = '/';
            num = double.Parse(textBox1.Text);
            textBox1.Clear();
        }

        private void button18_Click(object sender, EventArgs e)
        {
            if(operacao == '+')
            {
                
            }
        }
    }
}
