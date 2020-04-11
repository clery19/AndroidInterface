package bandtec.com.multiplastelas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_tela2.*

class Tela2 : AppCompatActivity() {

    var contadorTela2 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val usuario = intent.extras.getString("usuario")
        val idade = intent.extras.getInt("idade")
        val isAdmin = intent.extras.getBoolean("isAdmin")

        val mensagem = "o usuário ${usuario} tem ${idade} anos. Administrador? ${isAdmin}"
        Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show()

    }

    fun contar(v: View){
        contadorTela2++
        tvTopoTela2.text = "Você já clicou ${contadorTela2} vezes!  "
    }

    override fun onBackPressed() {
        if (contadorTela2 >= 5){
            super.onBackPressed()
        }else{
            tvTopoTela2.text = "Preciso de 5 toques, please!"
        }
    }
}
