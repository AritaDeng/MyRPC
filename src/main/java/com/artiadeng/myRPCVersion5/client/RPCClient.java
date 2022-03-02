package com.artiadeng.myRPCVersion5.client;


import com.artiadeng.myRPCVersion5.common.RPCRequest;
import com.artiadeng.myRPCVersion5.common.RPCResponse;

public interface RPCClient {
    RPCResponse sendRequest(RPCRequest request);
}
