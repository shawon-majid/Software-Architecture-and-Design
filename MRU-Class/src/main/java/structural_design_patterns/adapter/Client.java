package structural_design_patterns.adapter;

public class Client {
    JSON json = new JSON("json data");
    IAdapter<JSON> iAdapter = new JsonToXmlAdapter(json);

    IAdapter<Protobuffer> iAdapter2 = new ProtobufferToXmlAdapter(null);
    XML xml = iAdapter.convert(json);
}
