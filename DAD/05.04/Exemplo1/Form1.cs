using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Exemplo1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int mult = Convert.ToInt32(textBox1.Text);

            for(int i = 0; i <= 10; i++)
            {
                listBox1.Items.Add($"{mult} x {i} = {mult * i}");
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            listBox1.Items.Clear();
        }

        private void textBox1_KeyPress(object sender, KeyPressEventArgs e)
        {
            if(e.KeyChar == 13)
            {
                // button1.Focus();
                button1_Click(sender, e);
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
