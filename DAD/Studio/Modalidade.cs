using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Studio
{
    class Modalidade
    {

        private string descricao;
        private double preco;
        private int qtde_alunos;
        private int qtde_aulas;

        public Modalidade(string descricao, double preco, int qtde_alunos, int qtde_aulas)
        {
            this.descricao = descricao;
            this.preco = preco;
            this.qtde_alunos = qtde_alunos;
            this.qtde_aulas = qtde_aulas;
        }

        public Modalidade(string descricao)
        {
            this.descricao = descricao;
        }

        public Modalidade()
        {
        }

        public string Descricao { get => descricao; set => descricao = value; }
        public double Preco { get => preco; set => preco = value; }
        public int Qtde_alunos { get => qtde_alunos; set => qtde_alunos = value; }
        public int Qtde_aulas { get => qtde_aulas; set => qtde_aulas = value; }

        
        public bool cadastrarModalidade() 
        {
            bool cadastro = false;

            try
            {
                DAO_Conexao.con.Open();
                MySqlCommand sql = new MySqlCommand("INSERT INTO Estudio_Modalidade (descricaoModalidade, precoModalidade, qtdeAlunos, qtdeAulas) values" + 
                    "('" + descricao + "', " + preco + ", " + qtde_alunos + ", " + qtde_aulas + ")", DAO_Conexao.con);
                sql.ExecuteNonQuery();
                cadastro = true;
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                DAO_Conexao.con.Close();
            }

            return cadastro;
        }

        static public MySqlDataReader consultarTodasModalidades()
        {
            MySqlDataReader dadosModalidade = null;

            try
            {
                DAO_Conexao.con.Open();
                MySqlCommand sql = new MySqlCommand("SELECT * FROM Estudio_Modalidade WHERE ativa = 1", DAO_Conexao.con);
                dadosModalidade = sql.ExecuteReader();
            }
            catch(Exception ex)
            {
                Console.WriteLine(ex.ToString());
            }

            return dadosModalidade;
        }

        /*
        public MySqlDataReader consultarModalidade()
        {

        }

        

        public bool atualizarModalidade()
        {

        }

        public bool excluirModalidade()
        {

        }
        */
    }
}
