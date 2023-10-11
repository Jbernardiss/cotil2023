using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Studio
{
    class Turma
    {
        private string professor, dia_semana, hora;
        private int modalidade, id, numeroAlunosTurma;

        public string Professor { get => professor; set => professor = value; }
        public string Dia_semana { get => dia_semana; set => dia_semana = value; }
        public string Hora { get => hora; set => hora = value; }
        public int Modalidade { get => Modalidade1; set => Modalidade1 = value; }
        public int Modalidade1 { get => modalidade; set => modalidade = value; }

        public Turma (int modalidade, string professor, string dia_semana, string hora)
        {
            this.modalidade = modalidade;
            this.professor = professor;
            this.dia_semana = dia_semana;
            this.hora = hora;
        }

        public Turma(int modalidade)
        {
            this.modalidade = modalidade;
        }

        public Turma(int modalidade, string dia_semana)
        {
            this.modalidade = modalidade;
            this.dia_semana = dia_semana;
        }
        
        public bool cadastrarTurma()
        {
            bool cadastro = false;

            try
            {
                DAO_Conexao.con.Open();
                MySqlCommand sql = new MySqlCommand($"INSERT INTO Estudio_Turma (idModalidade, professorTurma, diaSemanaTurma, horaTurma) VALUES ('{modalidade}', '{professor}', '{dia_semana}', '{hora}') ", DAO_Conexao.con);
                sql.ExecuteNonQuery();
                cadastro = true;

            }catch(Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                DAO_Conexao.con.Close();
            }

            return cadastro;
        }

        static public MySqlDataReader consultarTurmaPorModalidade(int idModalidade)
        {
            MySqlDataReader dadosTurmas = null;

            try
            {
                DAO_Conexao.con.Open();
                MySqlCommand sql = new MySqlCommand($"SELECT * FROM Estudio_Turma WHERE idModalidade = {idModalidade}", DAO_Conexao.con);
                dadosTurmas = sql.ExecuteReader();
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.ToString());
            }

            return dadosTurmas;
        }

        /*
        public bool excluirTurma()
        {
            
        }

        public MySqlDataReader consultarTurma()
        {

        }

        public MySqlDataReader consultarTodasTurmas()
        {
            
        }
        */
    }
}
