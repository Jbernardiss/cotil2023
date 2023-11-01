namespace Studio
{
    partial class Form10
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.dataGridViewTurma = new System.Windows.Forms.DataGridView();
            this.dataGridViewAluno = new System.Windows.Forms.DataGridView();
            this.txtcNome = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.lblAlunoTable = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.NomeTurma = new System.Windows.Forms.DataGridViewTextBoxColumn();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewTurma)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewAluno)).BeginInit();
            this.SuspendLayout();
            // 
            // dataGridViewTurma
            // 
            this.dataGridViewTurma.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridViewTurma.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.NomeTurma});
            this.dataGridViewTurma.Location = new System.Drawing.Point(317, 43);
            this.dataGridViewTurma.Name = "dataGridViewTurma";
            this.dataGridViewTurma.Size = new System.Drawing.Size(246, 406);
            this.dataGridViewTurma.TabIndex = 0;
            // 
            // dataGridViewAluno
            // 
            this.dataGridViewAluno.AllowUserToAddRows = false;
            this.dataGridViewAluno.AllowUserToDeleteRows = false;
            this.dataGridViewAluno.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridViewAluno.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.txtcNome});
            this.dataGridViewAluno.Location = new System.Drawing.Point(26, 43);
            this.dataGridViewAluno.Name = "dataGridViewAluno";
            this.dataGridViewAluno.Size = new System.Drawing.Size(240, 406);
            this.dataGridViewAluno.TabIndex = 1;
            this.dataGridViewAluno.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dataGridView2_CellContentClick);
            // 
            // txtcNome
            // 
            this.txtcNome.HeaderText = "Nome";
            this.txtcNome.Name = "txtcNome";
            // 
            // lblAlunoTable
            // 
            this.lblAlunoTable.AutoSize = true;
            this.lblAlunoTable.Location = new System.Drawing.Point(98, 18);
            this.lblAlunoTable.Name = "lblAlunoTable";
            this.lblAlunoTable.Size = new System.Drawing.Size(87, 13);
            this.lblAlunoTable.TabIndex = 2;
            this.lblAlunoTable.Text = "Selecionar Aluno";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(394, 18);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(90, 13);
            this.label1.TabIndex = 3;
            this.label1.Text = "Selecionar Turma";
            // 
            // NomeTurma
            // 
            this.NomeTurma.HeaderText = "Nome Turma";
            this.NomeTurma.Name = "NomeTurma";
            // 
            // Form10
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(589, 520);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.lblAlunoTable);
            this.Controls.Add(this.dataGridViewAluno);
            this.Controls.Add(this.dataGridViewTurma);
            this.Name = "Form10";
            this.Text = "Form10";
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewTurma)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewAluno)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.DataGridView dataGridViewTurma;
        private System.Windows.Forms.DataGridView dataGridViewAluno;
        private System.Windows.Forms.Label lblAlunoTable;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.DataGridViewTextBoxColumn txtcNome;
        private System.Windows.Forms.DataGridViewTextBoxColumn NomeTurma;
    }
}