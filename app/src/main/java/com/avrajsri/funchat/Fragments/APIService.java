package com.avrajsri.funchat.Fragments;

import com.avrajsri.funchat.Notifications.MyResponse;
import com.avrajsri.funchat.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA6Uj8ch4:APA91bGRI49v_jbI4NzjvnO4DlOYKg1YnHDzSGSPsJPozNFkkplfPwE4kfV87T4nenLt93nRQA4y2vbYUkYT7X55zzeAIf7mM-0tbLymKy9WqjFhmQNHlavADud4YIIaALwwMTPImpeS"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
