package com.example.fareedahmad.chinder.ui.donor;


import android.util.Log;

import com.example.fareedahmad.chinder.model.Organization;
import com.example.fareedahmad.chinder.network.NetworkManager;

import java.util.List;

import io.reactivex.Scheduler;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class DonorPresenterImpl implements DonorContract.Presenter {

    private NetworkManager networkManager;
    private DonorContract.View view;

    public DonorPresenterImpl(NetworkManager networkManager, DonorContract.View view) {
        this.networkManager = networkManager;
        this.view = view;
    }

    @Override
    public void getOrganization() {
        networkManager.getCollections(null)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<List<Organization>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onSuccess(List<Organization> organizations) {
                        view.displayOrganizations(organizations);
                        Log.d("SUCCESS", "onSuccess: " + organizations);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("ERROR", "onError: " + e.getMessage());
                    }
                });
    }
}
