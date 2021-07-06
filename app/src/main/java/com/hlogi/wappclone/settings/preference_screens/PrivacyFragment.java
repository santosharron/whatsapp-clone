package com.hlogi.wappclone.settings.preference_screens;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import com.hlogi.wappclone.R;

public class PrivacyFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.privacy, rootKey);
    }
}
