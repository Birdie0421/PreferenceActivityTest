package edu.fjnu.birdie.preferenceactivitytest;

import android.app.Activity;
import android.preference.CheckBoxPreference;
import android.preference.PreferenceFragment;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceActivity;
import android.preference.Preference;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;



public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getFragmentManager().beginTransaction().replace(android.R.id.content, new PrefsFragement()).commit();

        // CheckBox parentBox = (CheckBoxPreference) findViewById(R.id.parentChkBox);
        // CheckBox childBox = (CheckBoxPreference) findViewById(R.id.childChkBox);
        // findPreference已弃用
        //parentBox = (CheckBoxPreference)  findPreference(PKEY);

//        parentBox.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if(parentBox.isChecked()){
//                    childBox.setEnabled(true);
//                }else{
//                    childBox.setEnabled(false);
//                }
//            }
//        });
    }
    public static class PrefsFragement extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.preference_frag1);

        }
    }



}
