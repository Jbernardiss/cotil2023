using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Studio
{
    class Matricula
    {
        string cpfAluno;
        int idTurma;

        public Matricula(string cpfAluno, int idTurma)
        {
            this.cpfAluno = cpfAluno;
            this.idTurma = idTurma;
        }

        public string CpfAluno { get => cpfAluno; set => cpfAluno = value; }
        public int IdTurma { get => idTurma; set => idTurma = value; }


        public bool cadastrarMatricula()
        {
            bool cadastrado = false;
            MySqlDataReader dadosTurma;

            try
            {
                DAO_Conexao.con.Open();
                MySqlCommand sql = new MySqlCommand($"INSERT INTO Estudio_Matricula (cpfAluno, idTurma) VALUES('{cpfAluno}', {idTurma})", DAO_Conexao.con);
                sql.ExecuteNonQuery();
                

                sql = new MySqlCommand($"SELECT * from Estudio_Turma where idEstudio_Turma = {idTurma}", DAO_Conexao.con);
                dadosTurma = sql.ExecuteReader();

                dadosTurma.Read();
                MessageBox.Show($"{dadosTurma["idEstudio_Turma"]}");
                int currentAlunos = Convert.ToInt32(dadosTurma["nAlunosTurma"].ToString());
                MessageBox.Show($"{currentAlunos}");
                DAO_Conexao.con.Close();

                DAO_Conexao.con.Open();
                sql = new MySqlCommand($"UPDATE Estudio_Turma SET nAlunosTurma = '{currentAlunos + 1}' where idEstudio_Turma = {idTurma}", DAO_Conexao.con);
                sql.ExecuteNonQuery();

                cadastrado = true;
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                DAO_Conexao.con.Close();
            }

            return cadastrado;
        }
    }
}
