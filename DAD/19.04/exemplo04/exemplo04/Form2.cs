﻿using System;
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
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            colorDialog1.ShowDialog();
            BackColor = colorDialog1.Color;
        }

        private void Form2_FormClosed(object sender, FormClosedEventArgs e)
        {
            Form1.isOpen = false;
        }
    }
}
