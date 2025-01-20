package com.eg.yamocker.backend.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/mock")
public class MainController {

//    private final RequestValidator requestValidator;
//    private final Req2ServiceReq req2ServiceReq;
//    private final StockService stockService;

//    public MainController(RequestValidator requestValidator, Req2ServiceReq req2ServiceReq, StockService stockService) {
//        this.requestValidator = requestValidator;
//        this.req2ServiceReq = req2ServiceReq;
//        this.stockService = stockService;
//    }

//    @PostMapping
//    public void createStock(@RequestBody @Valid CreateStockReq createStockReq){
//        requestValidator.validate(createStockReq);
//        CreateStockServiceReq serviceReq = req2ServiceReq.createStockReq2CreateStockServiceReq(createStockReq);
//        stockService.createStock(serviceReq);
//    }
//
//    @PutMapping
//    public void updateStockPrice(@RequestBody @Valid UpdateStockPriceReq updateStockPriceReq) {
//        UpdateStockPriceServiceReq serviceReq = req2ServiceReq.updateStockPriceReq2UpdateStockPriceServiceReq(updateStockPriceReq);
//        stockService.updatePrice(serviceReq);
//    }
//
//    @DeleteMapping("/{stockName}")
//    public void deleteStock(@PathVariable String stockName){
//        stockService.deleteStock(stockName);
//    }

    @PostMapping
    public void createMock() {
    }

    @DeleteMapping("/{mockId}")
    public void deleteMock(@PathVariable String mockId) {
    }

    @GetMapping("/{mockId}")
    public void getMock(@PathVariable String mockId) {
    }

    @PutMapping
    public void updateMock() {
    }
}
