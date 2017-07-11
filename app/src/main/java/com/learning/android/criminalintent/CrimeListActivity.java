package com.learning.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Zachary McGill on 7/11/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
