package com.artiadeng.myRPCVersion3.client;


import com.artiadeng.myRPCVersion3.common.RPCRequest;
import com.artiadeng.myRPCVersion3.common.RPCResponse;

public interface RPCClient {
    RPCResponse sendRequest(RPCRequest request);
}
