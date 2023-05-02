using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Exemplo_4
{
    public partial class Form1 : Form
    {
         int sentinela = 0;
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            for(int i = 0; i <= 100; i+=25)
            {
                progressBar1.Value = i;
            }
            if (!(listBox1.Items.Contains(comboBox1.Text)) && comboBox1.Text != "")
            {
                listBox1.Items.Add(comboBox1.Text);
                comboBox1.Items.Remove(comboBox1.SelectedItem);
                sentinela++;
            }
        }
 

        private void listBox1_DoubleClick(object sender, EventArgs e)
        {
            comboBox1.Items.Add(listBox1.SelectedItem.ToString());
            listBox1.Items.Remove(listBox1.SelectedItem);
            sentinela--;
        }
    }
}
