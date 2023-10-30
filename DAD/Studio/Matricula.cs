using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Studio
{
    class Matricula
    {
        int id;
        string cpfAluno;
        int idTurma;

        public Matricula(int id, string cpfAluno, int idTurma)
        {
            this.id = id;
            this.cpfAluno = cpfAluno;
            this.idTurma = idTurma;
        }

        public Matricula(string cpfAluno, int idTurma)
        {
            this.cpfAluno = cpfAluno;
            this.idTurma = idTurma;
        }

        public int Id { get => id; set => id = value; }
        public string CpfAluno { get => cpfAluno; set => cpfAluno = value; }
        public int IdTurma { get => idTurma; set => idTurma = value; }


        public bool cadastrarMatricula(string cpfAluno, int idTurma)
        {
            bool cadastrado = false;

            try
            {
                DAO_Conexao.con.Open();
                MySqlCommand sql = new MySqlCommand($"INSERT INTO Estudio_Matricula (cpfAluno, idTurma) VALUES('{cpfAluno}', {idTurma})", DAO_Conexao.con);
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

        static public int getNumeroCadastrosTurma(int idTurma)
        {
            MySqlDataReader cadastros;
            int count = 0;

            try
            {
                DAO_Conexao.con.Open();
                MySqlCommand sql = new MySqlCommand($"SELECT * AS contagem FROM Estudio_Matricula WHERE idTurma = {idTurma} AND ativa = 1", DAO_Conexao.con);
                cadastros = sql.ExecuteReader();
                while(cadastros.Read())
                {
                    count++;
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.ToString());
            }
            finally
            {
                DAO_Conexao.con.Close();
            }

            return count;
        } 
    }
}
