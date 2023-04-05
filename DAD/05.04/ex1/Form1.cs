using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ex1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "COTIL" || textBox1.Text == "UNICAMP")
            {
                label1.ForeColor = Color.Green;
                label1.Text = "Acertou: " + textBox1.Text + "!";
            }
            else
            {
                label1.ForeColor = Color.Red;
                label1.Text = "Errou!";
            }
        }
    }
}
