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
        int selectedIdTurma;

        public Form10()
        {
            InitializeComponent();

            carregarAlunos();
            carregarTurmas();

            selectedCpf = arrAluno[0].getCpf();
            selectedIdTurma = arrTurma[0].Id;
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

            arrTurma.Clear();
            dataGridViewTurma.Rows.Clear();

            while (dadosTurma.Read())
            {
                int idEstudioTurma = Int32.Parse(dadosTurma["idEstudio_Turma"].ToString());
                int idModalidade = Int32.Parse(dadosTurma["idModalidade"].ToString());
                string professorTurma = dadosTurma["professorTurma"].ToString();
                string diaSemanaTurma = dadosTurma["diaSemanaTurma"].ToString();
                string horaTurma = dadosTurma["horaTurma"].ToString();
                int numeroAlunosTurma = Int32.Parse(dadosTurma["nAlunosTurma"].ToString());
                string descricaoModalidade = dadosTurma["descricaoModalidade"].ToString();

                Turma turma = new Turma(idEstudioTurma, professorTurma, diaSemanaTurma, horaTurma, descricaoModalidade, idModalidade, numeroAlunosTurma);
                arrTurma.Add(turma);
                dataGridViewTurma.Rows.Add(turma.DescModalidade + "#" + turma.Id, turma.Professor, turma.Dia_semana, turma.Hora, turma.NumeroAlunosTurma);
            }

            DAO_Conexao.con.Close();
        }

        private void dataGridViewAluno_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            selectedCpf = arrAluno[dataGridViewAluno.CurrentCell.RowIndex].getCpf();
            MessageBox.Show(selectedCpf);
        }

        private void dataGridViewTurma_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            selectedIdTurma = arrTurma[dataGridViewTurma.CurrentCell.RowIndex].Id;
            MessageBox.Show($"{selectedIdTurma}");
        }

        private void btnMatricular_Click(object sender, EventArgs e)
        {
            Matricula matricula = new Matricula(selectedCpf, selectedIdTurma);
            if(matricula.cadastrarMatricula())
            {
                MessageBox.Show("Matrícula feita com sucesso!");
                carregarTurmas();
            }
            else
            {
                MessageBox.Show("Erro ao realizar matrícula");
            }
        }
    }
}
