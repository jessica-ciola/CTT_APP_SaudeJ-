package com.ctt.saude_ja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.ctt.saude_ja.model.Medicamento
import kotlinx.android.synthetic.main.activity_cadastro_medicamento.*

class CadastroMedicamentoActivity : AppCompatActivity() {

    lateinit var nomeMedicamento: TextView
    lateinit var infoMedicamento: TextView
    lateinit var frequenciaMedicamento: TextView
    lateinit var horarioMedicamento: TextView
    lateinit var botaoCadastrar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_medicamento)

        nomeMedicamento = findViewById(R.id.edtNomeMedicamento)
        botaoCadastrar = findViewById(R.id.btnCadastrar2)
        frequenciaMedicamento = findViewById(R.id.edtFreq)
        horarioMedicamento = findViewById(R.id.edtHorario)
        infoMedicamento = findViewById(R.id.edtDescricao)



        botaoCadastrar.setOnClickListener(View.OnClickListener(){

            val nomeDigitado = edtNomeMedicamento.text.toString()
            val freqDigitada = edtFreq.text.toString()
            val horarioDigitado = edtHorario.text.toString()
            val infoDigitado = edtDescricao.text.toString()



            if(nomeDigitado.isEmpty()){
                if(freqDigitada.isEmpty()){
                    frequenciaMedicamento.error = "Digite a frequência de uso"
                } else{
                    nomeMedicamento.error = "Digite o nome do medicamento"}
            }else{
                val medicamento =  Medicamento(nomeDigitado, freqDigitada, horarioDigitado, infoDigitado)

                val chaveMedicamento = "MEDICAMENTO"

                val destinoActivity = Intent(this, MainActivity::class.java)
                //android não entende a classe que vc cria precisa criar uma função parcelable
                //pra ele entender que é uma classe q vc criou
                destinoActivity.putExtra(chaveMedicamento, medicamento)



                //Inicia uma nova Activity
                startActivity(destinoActivity)




            }

        })




    }


}