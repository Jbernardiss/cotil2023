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
    public partial class CalcOleo : Form
    {
        public CalcOleo()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            double calc;
            try
            {
                if (comboBox1.SelectedIndex == 0)
                {
                    calc = 0.5 * float.Parse(textBox1.Text);
                    label4.Text = calc.ToString("0.00") + "L";
                }
                else if (comboBox1.SelectedIndex == 1)
                {
                    calc = 1 * float.Parse(textBox1.Text);
                    label4.Text = calc.ToString("0.00")  + "L";
                }
                else
                {
                    MessageBox.Show("Selecione um frasco de óleo", "ATENÇÃO", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("Dados Incorretos");
                MessageBox.Show(ex.Message);
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            textBox1.Text = "";
            label4.Text = "";

            comboBox1.SelectedIndex = -1;
        }
    }
}
