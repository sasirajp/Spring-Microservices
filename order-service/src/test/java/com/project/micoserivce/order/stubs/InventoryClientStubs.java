package com.project.micoserivce.order.stubs;


import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class InventoryClientStubs {

    public static void stubInventoryCalls(String skuCode, Integer quantity) {
        stubFor(get(urlEqualTo("/api/inventory?skuCode="+skuCode+"&quantity="+quantity))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody("true")));
    }

}
