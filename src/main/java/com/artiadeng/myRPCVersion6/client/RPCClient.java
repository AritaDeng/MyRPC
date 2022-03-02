package com.artiadeng.myRPCVersion6.client;


import com.artiadeng.myRPCVersion6.common.RPCRequest;
import com.artiadeng.myRPCVersion6.common.RPCResponse;

public interface RPCClient {
    RPCResponse sendRequest(RPCRequest request);
}
