using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Studio
{
    class Aluno
    {
        private string cpf;
        private string nome;
        private string rua;
        private string numero;
        private string bairro;
        private string complmento;
        private string cep;
        private string cidade;
        private string estado;
        private string telefone;
        private string email;
        private byte[] foto;
        private bool ativo;


        public Aluno(string cpf, string nome, string rua, string numero, string bairro, string complemento, string cep, string cidade, string estado, string telefone, 
        string email, byte[] foto) {
            setCpf(cpf);
            setNome(nome);
            setRua(rua);
            setNumero(numero);
            setBairro(bairro);
            setComplmento(complmento);
            setCep(cep);
            setCidade(cidade);
            setEstado(estado);
            setTelefone(telefone);
            setEmail(email);
            setFoto(foto);
            setAtivo(true);
        }

        public Aluno()
        {

        }

        public Aluno(string cpf)
        {
            setCpf(cpf);
        }

        public bool cadastroAluno()
        {
            /*
            bool cadastro = false;
            try
            {
                DAO_Conexao.con.Open();
            }

            return cadastro;
            */
        }



        public string getCpf()
        {
            return cpf;
        }

        public void setCpf(String cpf)
        {
            this.cpf = cpf;
        }

        public string getNome()
        {
            return nome;
        }

        public void setNome(String nome)
        {
            this.nome = nome;
        }

        public string getRua()
        {
            return rua;
        }

        public void setRua(String rua)
        {
            this.rua = rua;
        }

        public string getNumero()
        {
            return numero;
        }

        public void setNumero(String numero)
        {
            this.numero = numero;
        }

        public string getBairro()
        {
            return bairro;
        }

        public void setBairro(String bairro)
        {
            this.bairro = bairro;
        }

        public string getComplmento()
        {
            return complmento;
        }

        public void setComplmento(String complmento)
        {
            this.complmento = complmento;
        }

        public string getCep()
        {
            return cep;
        }

        public void setCep(String cep)
        {
            this.cep = cep;
        }

        public string getCidade()
        {
            return cidade;
        }

        public void setCidade(String cidade)
        {
            this.cidade = cidade;
        }

        public string getEstado()
        {
            return estado;
        }

        public void setEstado(String estado)
        {
            this.estado = estado;
        }

        public string getTelefone()
        {
            return telefone;
        }

        public void setTelefone(String telefone)
        {
            this.telefone = telefone;
        }

        public string getEmail()
        {
            return email;
        }

        public void setEmail(String email)
        {
            this.email = email;
        }

        public byte[] getFoto()
        {
            return foto;
        }

        public void setFoto(byte[] foto)
        {
            this.foto = foto;
        }

        public bool isAtivo()
        {
            return ativo;
        }

        public void setAtivo(bool ativo)
        {
            this.ativo = ativo;
        }
    }
}
