package ac.grim.grimac.utils.data;

import ac.grim.grimac.utils.data.packetentity.PacketEntity;
import ac.grim.grimac.utils.math.Vector3dm;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class EntityHitData {
    private final PacketEntity entity;
    private final Vector3dm intersectionPoint;

    public EntityHitData(PacketEntity packetEntity, Vector3dm intersectionPoint) {
        this.entity = packetEntity;
        this.intersectionPoint = intersectionPoint;
    }
}
