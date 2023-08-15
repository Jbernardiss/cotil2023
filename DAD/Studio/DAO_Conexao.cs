using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Studio
{
    class DAO_Conexao
    {
        private static MySqlConnection con;
        public static Boolean getConexao(String local, String banco, String user, String senha) 
        {
            Boolean retorno = false;
            try
            {
                con = new MySqlConnection("server=" + local + ";User ID=" + user + ";" + "database=" + banco + 
                    "; password=" + senha + "; SslMode = none");
                con.Open();
                retorno = true;
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            return retorno;
        }

        public static Boolean cadLogin(string usuario, string senha, int tipo)
        {
            bool cad = false;
            try
            {
                con.Open();
                MySqlCommand insere = new MySqlCommand("insert into Estudio_Login (usuario, senha, tipo) " +
                    "values ('" + usuario + "','" + senha + "'," + tipo + ")", con);
                insere.ExecuteNonQuery();
                cad = true;
            }
            catch(Exception ex)
            {
                Console.WriteLine(ex.ToString());
            }
            finally
            {
                con.Close();
            }
            return cad;
        }

        public static Boolean loginExiste(string usuario, string senha)
        {
            bool existe = false;
            try
            {
                MySqlCommand select = new MySqlCommand("select * from Estudio_Login where (usuario = '" + usuario + "' and senha = '" + senha + "')", con);
                select.ExecuteReader();
                existe = true;
            }
            catch(Exception ex)
            {
                Console.WriteLine(ex.ToString());
            }

            return existe;
        }
    }
}
