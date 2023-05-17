using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace exemplo04
{
    public partial class Form1 : Form
    {
        public static bool isOpen = false;

        // Form2 form2 = new Form2();
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Form2 form2 = new Form2();

            if (!(isOpen))
            {
                form2.Show();
                isOpen = true;
            }
        }

        private void novoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form2 form2 = new Form2();
            form2.BackColor = Color.Yellow;
            if (!(isOpen))
            {
                form2.Show();
                isOpen = true;
            }
        }
    }
}
