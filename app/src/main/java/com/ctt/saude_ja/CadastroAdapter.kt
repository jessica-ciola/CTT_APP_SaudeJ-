package com.ctt.saude_ja

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ctt.saude_ja.model.Medicamento

class CadastroAdapter(private var listaDeMedicamentos:MutableList<Medicamento>) :  RecyclerView.Adapter<CadastroAdapter.MedicamentoHolder>() {

    class MedicamentoHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nomeMedicamento: TextView = view.findViewById(R.id.txtNomeMedicamento)
        val freMedicamento: TextView = view.findViewById(R.id.txtFrequencia)
        val horarioMed: TextView = view.findViewById(R.id.txtHorario)
        val descMed: TextView = view.findViewById(R.id.txtInfoMedicamento)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedicamentoHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_medicamento, parent, false)
        return MedicamentoHolder(view)

    }


    override fun getItemCount(): Int {
        return listaDeMedicamentos.size
    }

    override fun onBindViewHolder(holder: CadastroAdapter.MedicamentoHolder, position: Int) {
        holder.nomeMedicamento.text = listaDeMedicamentos[position].nome
        holder.freMedicamento.text = listaDeMedicamentos[position].frequencia
        holder.horarioMed.text = listaDeMedicamentos[position].horario
        holder.descMed.text = listaDeMedicamentos[position].descricao

    }

}

