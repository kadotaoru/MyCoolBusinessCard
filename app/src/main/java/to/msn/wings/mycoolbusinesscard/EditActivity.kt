package to.msn.wings.mycoolbusinesscard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.preference.PreferenceManager
import kotlinx.android.synthetic.main.activity_edit.*

class EditActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val company = pref.getString("company", "")
        val postal = pref.getString("company", "")
        val address = pref.getString("company", "")
        val tel = pref.getString("company", "")
        val fax = pref.getString("company", "")
        val email = pref.getString("company", "")
        val url = pref.getString("company", "")
        val position = pref.getString("company", "")
        val name = pref.getString("company", "")

        companyEdit.setText(company)
        postalEdit.setText(postal)
        addressEdit.setText(address)
        telEdit.setText(tel)
        faxEdit.setText(fax)
        emailEdit.setText(email)
        urlEdit.setText(url)
        positionEdit.setText(position)
        nameEdit.setText(name)

        saveBtn.setOnClickListener() {
            saveData()
            finish()
        }
        cancelBtn.setOnClickListener {
            finish()
        }
    }


    private fun saveData() {
        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val editor = pref.edit()
        editor.putString("company", companyEdit.text.toString())
            .putString("postal", postalEdit.text.toString())
            .putString("address", addressEdit.text.toString())
            .putString("tel", telEdit.text.toString())
            .putString("fax", faxEdit.text.toString())
            .putString("email", emailEdit.text.toString())
            .putString("url", urlEdit.text.toString())
            .putString("position", positionEdit.text.toString())
            .putString("name", nameEdit.text.toString())
            .apply()
    }
}

