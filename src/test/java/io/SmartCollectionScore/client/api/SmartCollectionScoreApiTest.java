package io.SmartCollectionScore.client.api;

import java.util.concurrent.TimeUnit;

import com.cdc.apihub.signer.manager.interceptor.SignerInterceptor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.SmartCollectionScore.client.ApiClient;
import io.SmartCollectionScore.client.ApiException;
import io.SmartCollectionScore.client.ApiResponse;
import io.SmartCollectionScore.client.model.CatalogoFronteraDeImpago;
import io.SmartCollectionScore.client.model.CatalogoPeriodosVencidos;
import io.SmartCollectionScore.client.model.CatalogoTipoContrato;
import io.SmartCollectionScore.client.model.CatalogoTipoCuenta;
import io.SmartCollectionScore.client.model.CatalogoTipoFrecuencia;
import io.SmartCollectionScore.client.model.CatalogoVentanaTiempo;
import io.SmartCollectionScore.client.model.Peticion;
import io.SmartCollectionScore.client.model.Respuesta;
import okhttp3.OkHttpClient;


public class SmartCollectionScoreApiTest {
    private final SmartCollectionScoreApi api = new SmartCollectionScoreApi();
    private Logger logger = LoggerFactory.getLogger(SmartCollectionScoreApiTest.class.getName());

	private ApiClient apiClient;
	
    private String keystoreFile = "your_path_for_your_keystore/keystore.jks";
    private String cdcCertFile = "your_path_for_certificate_of_cdc/cdc_cert.pem";
    private String keystorePassword = "your_super_secure_keystore_password";
    private String keyAlias = "your_key_alias";
    private String keyPassword = "your_super_secure_password";
    
    private String usernameCDC = "your_username_otrorgante";
    private String passwordCDC = "your_password_otorgante"; 
    
    private String url = "the_url";
    private String xApiKey = "X_Api_Key";
 
    private SignerInterceptor interceptor;
    
    @Before()
	public void setUp() {
		interceptor = new SignerInterceptor(keystoreFile, cdcCertFile, keystorePassword, keyAlias, keyPassword);
		this.apiClient = api.getApiClient();
		this.apiClient.setBasePath(url);
		OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
			    .readTimeout(30, TimeUnit.SECONDS)
			    .addInterceptor(interceptor)
			    .build();
		apiClient.setHttpClient(okHttpClient);
    }
    
    @Test
    public void getReporteTest() throws ApiException {
        
        Peticion body = new Peticion();
        
        Integer estatusOK = 200;
        Integer estatusNoContent = 204;
        
        try {
        	
        	body.setFolioOtorgante("folioOtorgante");
            body.setNumeroCuenta("numeroCuenta");
            body.setTipoContrato(CatalogoTipoContrato.TC);
            body.setTipoCuenta(CatalogoTipoCuenta.R);
            body.setTipoFrecuencia(CatalogoTipoFrecuencia.M);
            body.setVentanaDeTiempo(CatalogoVentanaTiempo._1M);
            body.setFronteraDeImpago(CatalogoFronteraDeImpago.NUMBER_30);
            body.setPeriodosVencidos(CatalogoPeriodosVencidos._1);
            body.setSaldoVencido("saldoVencido");
            body.setSaldoActual("saldoActual");
            
            ApiResponse<?>  response = api.getReporteWithHttpInfo(xApiKey, usernameCDC, passwordCDC, body);
            
        	Assert.assertTrue(estatusOK.equals(response.getStatusCode()));
            
            if(estatusOK.equals(response.getStatusCode())) {
                Respuesta responseOK = (Respuesta) response.getData();
                logger.info(responseOK.toString());
            }

        } catch (ApiException e) {
            if(!estatusNoContent.equals(e.getCode())) {
                logger.info(e.getResponseBody());
            }
            Assert.assertTrue(estatusOK.equals(e.getCode()));           
        }
    }
    
}
