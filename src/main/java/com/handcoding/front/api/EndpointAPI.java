package com.handcoding.front.api;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.handcoding.front.domain.OAuth2TokenVO;
import com.handcoding.front.domain.OAuth2VO;
import com.handcoding.front.domain.ResponseVO;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * endpoint api
 * @author 이승환
 * @version 2018.01.28 v1.0
 */
public abstract class EndpointAPI<T> {
	
	protected static String API_URL = "http://localhost";
	protected Retrofit retrofit;
	protected String clientId;
	protected String clientSecret;
	
	{
		OkHttpClient client = new OkHttpClient.Builder()
												.readTimeout(5, TimeUnit.SECONDS)
												.connectTimeout(5, TimeUnit.SECONDS)
												.build();
		retrofit = new Retrofit.Builder()
								.baseUrl(API_URL)
								.addConverterFactory(GsonConverterFactory.create())
								.client(client)
								.build();
	}
	
	public EndpointAPI(String clientId, String clientSecret) {
		this.clientId = clientId;
		this.clientSecret = clientSecret;
	}

	protected abstract T create();
	
	/**
	 * API accessToken
	 * @return
	 */
	protected String oauth() {
		OAuth2 oAuth2 = retrofit.create(OAuth2.class);
		OAuth2VO oAuth2VO = new OAuth2VO(clientId, clientSecret);
		Call<ResponseVO<OAuth2TokenVO>> call = oAuth2.getOAuth(oAuth2VO);
		try {
			Response<ResponseVO<OAuth2TokenVO>> resopnse = call.execute();
			if(resopnse.isSuccessful()) {
				return resopnse.body().getResponse().getAccess_token();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
