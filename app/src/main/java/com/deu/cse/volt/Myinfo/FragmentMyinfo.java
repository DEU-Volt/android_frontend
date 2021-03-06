package com.deu.cse.volt.Myinfo;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.deu.cse.volt.RetrofitServiceGenerator.RetrofitBearerServiceGenerator;
import com.deu.cse.volt.R;

public class FragmentMyinfo extends Fragment {
    private MyinfoInterface MyinfoService;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.myinfo_fragment, container, false);
        MyinfoService = RetrofitBearerServiceGenerator.createService(MyinfoInterface.class);

        if(getArguments() != null) { // bearertoken 받아오기
            String token = getArguments().getString("bearertoken");
            Log.e("TOKEN_MYINFO", token);

        }

        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

//    public void loadInfo(){
//
//        MyinfoService.myInfo().enqueue(new Callback<UserIdDTO>() {
//            @Override
//            public void onResponse(Call<UserIdDTO> call, Response<UserIdDTO> response) {
//
//            }
//
//            @Override
//            public void onFailure(Call<UserIdDTO> call, Throwable t) {
//
//            }
//        });
//    }

}