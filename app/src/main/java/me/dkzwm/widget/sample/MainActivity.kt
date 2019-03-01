package me.dkzwm.widget.sample

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import me.dkzwm.widget.fet.FormattedEditText

/**
 * Created by dkzwm on 2017/2/23.
 *
 * @author dkzwm
 */
class MainActivity : AppCompatActivity() {
    private lateinit var mTextViewLogs: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mTextViewLogs = findViewById(R.id.textView_logs)
        findViewById<View>(R.id.button_clear)
                .setOnClickListener { mTextViewLogs.text = "" }
        val editText = findViewById<EditText>(R.id.editText_original)
        editText.addTextChangedListener(
                object : TextWatcher {
                    override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                        mTextViewLogs.append(
                                "未格式化: beforeTextChanged    s:"
                                        + s
                                        + "   "
                                        + "start:"
                                        + start
                                        + "    count:"
                                        + count
                                        + "   after:"
                                        + after
                                        + "\n")
                    }

                    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                        mTextViewLogs.append(
                                "未格式化: onTextChanged    s:"
                                        + s
                                        + "   "
                                        + "start:"
                                        + start
                                        + "    before:"
                                        + before
                                        + "   count:"
                                        + count
                                        + "\n")
                    }

                    override fun afterTextChanged(s: Editable) {
                        mTextViewLogs.append("未格式化: afterTextChanged    s:$s\n\n")
                    }
                })
        val editTextComplex = findViewById<EditText>(R.id.formattedEditText_complex)
        editTextComplex.addTextChangedListener(
                object : TextWatcher {
                    override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                        mTextViewLogs.append(
                                "复杂格式化后: beforeTextChanged    s:"
                                        + s
                                        + "   "
                                        + "start:"
                                        + start
                                        + "    count:"
                                        + count
                                        + "   after:"
                                        + after
                                        + "\n")
                    }

                    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                        mTextViewLogs.append(
                                "复杂格式化后: onTextChanged    s:"
                                        + s
                                        + "   "
                                        + "start:"
                                        + start
                                        + "    before:"
                                        + before
                                        + "   count:"
                                        + count
                                        + "\n")
                    }

                    override fun afterTextChanged(s: Editable) {
                        mTextViewLogs.append("复杂格式化后: afterTextChanged    s:$s\n\n")
                    }
                })
        val editTextSimple = findViewById<FormattedEditText>(R.id.formattedEditText_simple)
        editTextSimple.addTextChangedListener(
                object : TextWatcher {
                    override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                        mTextViewLogs.append(
                                "简单格式化后: beforeTextChanged    s:"
                                        + s
                                        + "   "
                                        + "start:"
                                        + start
                                        + "    count:"
                                        + count
                                        + "   after:"
                                        + after
                                        + "\n")
                    }

                    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                        mTextViewLogs.append(
                                "简单格式化后: onTextChanged    s:"
                                        + s
                                        + "   "
                                        + "start:"
                                        + start
                                        + "    before:"
                                        + before
                                        + "   count:"
                                        + count
                                        + "\n")
                    }

                    override fun afterTextChanged(s: Editable) {
                        mTextViewLogs.append("简单格式化后: afterTextChanged    s:$s\n\n")
                    }
                })
    }
}
