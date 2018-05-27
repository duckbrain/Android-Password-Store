package com.zeapo.pwdstore.autofill;

import android.annotation.TargetApi;
import android.content.Intent;

import com.zeapo.pwdstore.PasswordEntry;

import org.openintents.openpgp.OpenPgpDecryptionResult;

import java.io.File;
import java.util.List;
import java.util.Map;

@TargetApi(26)
public class DecryptionListener {
    void onDecrypted(PasswordEntry result){};
    void onBatchDecrypted(Map<File, PasswordEntry> results){};
    void onAuthenticationRequired(List<File> failedItems, Intent result){};
}