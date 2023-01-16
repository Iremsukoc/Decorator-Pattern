public class PreEmtiblevCPU extends CondimentDecorator{

    public PreEmtiblevCPU(Server server)
    {
        this.server = server;
    }
    @Override
    String getDescription() {
        return server.getDescription() + "PreEmtiblevCPU , ";
    }

    @Override
    Double cost() {
        return server.cost() + 0.006867;
    }
}
