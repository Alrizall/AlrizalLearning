package com.example.admin.feature.home

import androidx.lifecycle.ViewModel
import com.example.admin.R
import com.example.admin.local.PreferenceHelper
import com.example.admin.util.KeyConstant.USERNAME_KEY
import com.example.alrizallearning.data.DashboardInformation
import com.example.alrizallearning.data.DuedateInformation
import com.example.alrizallearrning.R
import com.example.core.DashboardInformation
import com.example.core.DuedateInformation
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val preferenceHelper: PreferenceHelper
) :
    ViewModel() {

    fun getUserName(): String {
        return preferenceHelper.getStringInSharedPreference(USERNAME_KEY)
    }

    fun dashboardInformationProvider(): List<DashboardInformation> {
        return listOf(
            DashboardInformation(1, R.drawable.img_kurikulum, "Kurikulum Baru"),
            DashboardInformation(2, R.drawable.img_bakti_kominfo, " Kemajuan Pendidikan "),
            DashboardInformation(3, R.drawable.img_user_interface, " Kemajuan Desain UI "),
            DashboardInformation(4, R.drawable.img_anak_sd, " Infrastruktur Sekolah Di Pedesaan  ")
        )
    }

    fun duedateInformationProvider(): List<DuedateInformation> {
        return listOf(
            DuedateInformation(1, "Tugas 1, dateline 1 hari lagi"),
            DuedateInformation(2, " Tugas 2, Dateline 2 hari lagi"),
            DuedateInformation(3, " Tugas 3, Dateline 3 hari lagi"),
        )
    }
}
