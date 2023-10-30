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
    public partial class Form10 : Form
    {
        List<Matricula> arrMatricula = new List<Matricula>();
        List<Aluno> arrAluno = new List<Aluno>();
        List<Turma> arrTurma = new List<Turma>();

        string selectedCpf;

        public Form10()
        {
            InitializeComponent();

            carregarAlunos();
            carregarTurmas();
        }

        public void carregarAlunos()
        {
            Aluno al = new Aluno();
            MySqlDataReader dadosAluno = al.consultarTodosAlunos();

            arrAluno.Clear();
            dataGridViewAluno.Rows.Clear();

            while(dadosAluno.Read())
            {
                string cpf = dadosAluno["CPFAluno"].ToString();
                string nome = dadosAluno["nomeAluno"].ToString();
                string endereco = dadosAluno["ruaAluno"].ToString();
                string numero = dadosAluno["numeroAluno"].ToString();
                string bairro = dadosAluno["bairroAluno"].ToString();
                string complemento = dadosAluno["complementoAluno"].ToString();
                string cep = dadosAluno["CEPAluno"].ToString();
                string cidade = dadosAluno["cidadeAluno"].ToString();
                string estado = dadosAluno["estadoAluno"].ToString();
                string tel = dadosAluno["telefoneAluno"].ToString();
                string email = dadosAluno["emailAluno"].ToString();


                al = new Aluno(cpf, nome, endereco, numero, bairro, complemento, cep, cidade, estado, tel, email);
                arrAluno.Add(al);
                dataGridViewAluno.Rows.Add(al.getNome());
            }

            DAO_Conexao.con.Close();
        }

        public void carregarTurmas()
        {
            MySqlDataReader dadosTurma = Turma.consultarTodasTurmasComDescModalidade();


        }

        private void dataGridView2_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            selectedCpf = arrAluno[dataGridViewAluno.CurrentCell.RowIndex].getCpf();
        }
    }
}
