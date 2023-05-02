using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace exemplo03
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            String curso = "";
            int serie = 0;

            if (radioButton1.Checked)
            {
                curso = "Desenvolvimento de Sistemas";
            }
            else if (radioButton2.Checked)
            {
                curso = "Edificações";
            }
            else if (radioButton3.Checked)
            {
                curso = "Geodésia e Cartografia";
            }

            if (radioButton6.Checked)
            {
                serie = 1;
            }
            else if (radioButton5.Checked)
            {
                serie = 2;
            }
            else if (radioButton4.Checked)
            {
                serie = 3;
            }

            if (!(String.IsNullOrEmpty(curso)) && (serie != 0))
            {
                label1.Text = "O aluno faz o curso " + curso + " e está na " + serie + " série";
            }
            else
            {
                MessageBox.Show("Escolhe um curso e uma série");
            }
        }

        bool isChecked1;
        bool isChecked2;
        bool isChecked3;
        bool isChecked4;
        bool isChecked5;
        bool isChecked6;

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {
            isChecked1 = radioButton1.Checked;
        }  

        private void radioButton1_Click(object sender, EventArgs e)
        {

            if(radioButton1.Checked && !(isChecked1)) {
                radioButton1.Checked = false;
            } else
            {
                radioButton1.Checked = true;
                isChecked1 = false;
            }
        }

        private void radioButton2_CheckedChanged(object sender, EventArgs e)
        {
            isChecked2 = radioButton2.Checked;
        }

        private void radioButton3_CheckedChanged(object sender, EventArgs e)
        {
            isChecked3 = radioButton3.Checked;
        }

        private void radioButton6_CheckedChanged(object sender, EventArgs e)
        {
            isChecked6 = radioButton6.Checked;
        }

        private void radioButton5_CheckedChanged(object sender, EventArgs e)
        {
            isChecked5 = radioButton5.Checked;
        }

        private void radioButton4_CheckedChanged(object sender, EventArgs e)
        {
            isChecked4 = radioButton4.Checked;
        }

        private void radioButton2_Click(object sender, EventArgs e)
        {
            if (radioButton2.Checked && !(isChecked2))
            {
                radioButton2.Checked = false;
            }
            else
            {
                radioButton2.Checked = true;
                isChecked2 = false;
            }
        }

        private void radioButton3_Click(object sender, EventArgs e)
        {
            if (radioButton3.Checked && !(isChecked3))
            {
                radioButton3.Checked = false;
            }
            else
            {
                radioButton3.Checked = true;
                isChecked3 = false;
            }
        }

        private void radioButton5_Click(object sender, EventArgs e)
        {
            if (radioButton5.Checked && !(isChecked5))
            {
                radioButton5.Checked = false;
            }
            else
            {
                radioButton5.Checked = true;
                isChecked5 = false;
            }
        }

        private void radioButton6_Click(object sender, EventArgs e)
        {
            if (radioButton6.Checked && !(isChecked6))
            {
                radioButton6.Checked = false;
            }
            else
            {
                radioButton6.Checked = true;
                isChecked6 = false;
            }
        }

        private void radioButton4_Click(object sender, EventArgs e)
        {
            if (radioButton4.Checked && !(isChecked4))
            {
                radioButton4.Checked = false;
            }
            else
            {
                radioButton4.Checked = true;
                isChecked4 = false;
            }
        }
    }
}
