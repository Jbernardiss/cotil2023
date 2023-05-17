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
    public partial class CalcCombustivel : Form
    {
        public CalcCombustivel()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            double calc;

            try
            {
                if (radioButton1.Checked)
                {
                    calc = (float.Parse(textBox1.Text) * float.Parse(textBox3.Text));
                    label5.Text = calc.ToString("0.00");
                } else if(radioButton2.Checked)
                {
                    calc = (float.Parse(textBox2.Text) * float.Parse(textBox3.Text));
                    label5.Text = calc.ToString("0.00");
                } else
                {
                    MessageBox.Show("Selecione um combustível", "ATENÇÃO", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                }
            } catch(Exception ex)
            {
                MessageBox.Show("Dados Incorretos");
                MessageBox.Show(ex.Message);
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            radioButton1.Checked = false;
            radioButton2.Checked = false;
            textBox3.Clear();
            label5.Text = "";

        }
    }
}
