package com.ctt.saude_ja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ctt.saude_ja.model.Medicamento

class MainActivity : AppCompatActivity() {


    lateinit var botaoCadastrar: Button
    lateinit var nomeMedicamento: TextView
    lateinit var infoMedicamento: TextView
    lateinit var frequenciaMedicamento: TextView
    lateinit var horarioMedicamento: TextView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botaoCadastrar = findViewById(R.id.btnCadastrar)


        botaoCadastrar.setOnClickListener (View.OnClickListener() {

            val destinoActivity = Intent(this, CadastroMedicamentoActivity::class.java)
            //android não entende a classe que vc cria precisa criar uma função parcelable
            //pra ele entender que é uma classe q vc criou

            //Inicia uma nova Activity
            startActivity(destinoActivity)



                    val medicamento = intent.extras?.get("MEDICAMENTO") as Medicamento

                  val listaMedicamentos = mutableListOf<Medicamento>(medicamento)

            val rvCadastro = findViewById<RecyclerView>(R.id.listaDeMedicamentos)

            rvCadastro.adapter = CadastroAdapter(listaMedicamentos)

            rvCadastro.layoutManager = LinearLayoutManager(this)








            })












    }

}