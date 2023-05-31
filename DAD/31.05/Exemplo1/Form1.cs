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

        private void textBox1_KeyPress(object sender, KeyPressEventArgs e)
        {
            if((Keys)e.KeyChar == Keys.Enter && !String.IsNullOrEmpty(textBox1.Text))
            {
                maskedTextBox1.Focus(); 
            }
        }

        private void maskedTextBox1_KeyPress(object sender, KeyPressEventArgs e)
        {
            if((Keys)e.KeyChar == Keys.Enter)
            {
                try
                {
                    Convert.ToDateTime(maskedTextBox1.Text);
                    listBox1.Items.Add(textBox1.Text);
                    listBox2.Items.Add(maskedTextBox1.Text);
                    textBox1.Clear();
                    maskedTextBox1.Clear();
                    textBox1.Focus();
                }
                catch (Exception ex)
                {
                    MessageBox.Show("Data Inválida");
                    maskedTextBox1.Focus();
                }




            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if(listBox3.SelectedIndex == 0)
            {
                textBox2.Text = (int.Parse(textBox2.Text) + 1).ToString();
            }else if(listBox3.SelectedIndex == 1)
            {
                textBox3.Text = (int.Parse(textBox3.Text) + 1).ToString();
            }
            else if(listBox3.SelectedIndex == 2)
            {
                textBox4.Text = (int.Parse(textBox4.Text) + 1).ToString();
            }
            else
            {
                MessageBox.Show("Selecione um candidato");
            }
            listBox3.ClearSelected();
        }

        private void listBox1_Click(object sender, EventArgs e)
        {
            try
            {
                listBox2.Items.RemoveAt(listBox1.SelectedIndex);
                listBox1.Items.RemoveAt(listBox1.SelectedIndex);
            }catch(Exception ex)
            {
                MessageBox.Show("Selecione um evento");
            }

        }

        private void listBox2_Click(object sender, EventArgs e)
        {
            try
            {
                listBox1.Items.RemoveAt(listBox2.SelectedIndex);
                listBox2.Items.RemoveAt(listBox2.SelectedIndex);
            }
            catch (Exception ex)
            {
                MessageBox.Show("Selecione um evento");
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            textBox2.Text = "0";
            textBox3.Text = "0";
            textBox4.Text = "0";
        }
    }
}
