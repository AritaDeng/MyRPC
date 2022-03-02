package com.artiadeng.myRPCVersion4.client;


import com.artiadeng.myRPCVersion4.common.RPCRequest;
import com.artiadeng.myRPCVersion4.common.RPCResponse;

public interface RPCClient {
    RPCResponse sendRequest(RPCRequest request);
}
