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

        private void sairToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void calcularCombustívelToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if(Application.OpenForms.OfType<CalcCombustivel>().Count() == 0)
            {
                CalcCombustivel filho1 = new CalcCombustivel();
                filho1.MdiParent = this;
                filho1.Show();
            }
        }

        private void calcularÓleoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (Application.OpenForms.OfType<CalcOleo>().Count() == 0)
            {
                CalcOleo filho2 = new CalcOleo();
                filho2.MdiParent = this;
                filho2.Show();
            }
        }

        private void ajudaToolStripMenuItem_Click(object sender, EventArgs e)
        {
            AboutBox1 about = new AboutBox1();
            about.ShowDialog();
        }
    }
}
