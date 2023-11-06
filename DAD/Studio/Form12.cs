using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Studio
{
    public partial class Form12 : Form
    {

        MySqlDataReader dados;
        List<Aluno> alList = new List<Aluno>();
        public Form12()
        {
            InitializeComponent();
        }

        public void carregarAlunosInativos()
        {
            Aluno al = new Aluno();
            dados = al.consultarAlunosInativos();

            while (dados.Read())
            {
                string nome 
                

            }
        }
    }
}