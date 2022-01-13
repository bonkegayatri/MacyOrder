package com.zensar;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.zensar.controller.OrderController;
import com.zensar.service.OrderService;

@WebMvcTest(OrderController.class)
public class OrderControllerTest {
	
	 @Autowired
	 MockMvc mockMvc;
	 
	 @MockBean
	 OrderService orderService;
	    
	    
	@Test
	public void testUpdateOrderStatus() throws Exception {
		ResponseEntity<String> expectedResult = new ResponseEntity<String>("1 record(s) updated.", HttpStatus.OK);
		Mockito.when(
				orderService.updateOrderStatus(Mockito.anyInt(),
						Mockito.anyString())).thenReturn(expectedResult);
		
		MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.put("/order/update/order_status/32/Confirmed")
	            .contentType(MediaType.APPLICATION_JSON)
	            .accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(mockRequest).andReturn();
		System.out.println(result.getResponse());
		String expected = "1 record(s) updated.";

//		JSONAssert.assertEquals(expected, result.getResponse()
//				.getContentAsString(), false);
		
		assertEquals(HttpStatus.OK.value(), result.getResponse().getStatus());

	}
	

}
