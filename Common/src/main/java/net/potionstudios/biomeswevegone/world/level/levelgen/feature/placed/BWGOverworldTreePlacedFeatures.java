package net.potionstudios.biomeswevegone.world.level.levelgen.feature.placed;

import com.google.common.collect.ImmutableList;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.BiasedToBottomInt;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.placement.*;
import net.potionstudios.biomeswevegone.BiomesWeveGone;
import net.potionstudios.biomeswevegone.world.level.levelgen.feature.configured.BWGOverworldTreeConfiguredFeatures;

import java.util.OptionalInt;

public class BWGOverworldTreePlacedFeatures {

    public static final ResourceKey<PlacedFeature> SPARSE_RED_OAK_TREES = PlacedFeaturesUtil.createPlacedFeature("sparse_red_oak_trees", BWGOverworldTreeConfiguredFeatures.RED_OAK_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(0, 0.2F, 1)));
    public static final ResourceKey<PlacedFeature> SPARSE_JACARANDA_TREES = PlacedFeaturesUtil.createPlacedFeature("sparse_jacaranda_trees", BWGOverworldTreeConfiguredFeatures.JACARANDA_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(0, 0.2F, 2)));
    public static final ResourceKey<PlacedFeature> ROSE_FIELD_SPRUCE_TREES = PlacedFeaturesUtil.createPlacedFeature("rose_field_spruce_trees", BWGOverworldTreeConfiguredFeatures.ROSE_FIELD_SPRUCE_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(0, 0.25F, 1)));
    public static final ResourceKey<PlacedFeature> SPARSE_ARAUCARIA_TREES = PlacedFeaturesUtil.createPlacedFeature("sparse_araucaria_trees", BWGOverworldTreeConfiguredFeatures.ARAUCARIA_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(0, 0.2F, 3)));
    public static final ResourceKey<PlacedFeature> IRONWOOD_PLATEAU_TREES = PlacedFeaturesUtil.createPlacedFeature("ironwood_plateau_trees", BWGOverworldTreeConfiguredFeatures.FLOWERING_IRONWOOD_TREES, () -> new ImmutableList.Builder<PlacementModifier>().add(PlacementUtils.countExtra(1, 0.1F, 1)).add(InSquarePlacement.spread()).add(SurfaceWaterDepthFilter.forMaxDepth(0)).add(PlacementUtils.HEIGHTMAP_OCEAN_FLOOR).add(SurfaceRelativeThresholdFilter.of(Heightmap.Types.WORLD_SURFACE_WG, 5, Integer.MAX_VALUE)).add(BiomeFilter.biome()).build());
    public static final ResourceKey<PlacedFeature> IRONWOOD_GROUND_TREES = PlacedFeaturesUtil.createPlacedFeature("ironwood_ground_trees", BWGOverworldTreeConfiguredFeatures.IRONWOOD_TREES, () -> new ImmutableList.Builder<PlacementModifier>().add(PlacementUtils.countExtra(1, 0.1F, 1)).add(InSquarePlacement.spread()).add(SurfaceWaterDepthFilter.forMaxDepth(0)).add(PlacementUtils.HEIGHTMAP_TOP_SOLID).add(SurfaceRelativeThresholdFilter.of(Heightmap.Types.WORLD_SURFACE_WG, 0, 4)).add(BiomeFilter.biome()).build());
    public static final ResourceKey<PlacedFeature> OAK_BUSHES = PlacedFeaturesUtil.createPlacedFeature("oak_bushes", BWGOverworldTreeConfiguredFeatures.OAK_BUSHES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(4, 0.25F, 2)));
    public static final ResourceKey<PlacedFeature> BAOBAB_TREES = PlacedFeaturesUtil.createPlacedFeature("baobab_trees", BWGOverworldTreeConfiguredFeatures.BAOBAB_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(0, 0.25F, 1)));
    public static final ResourceKey<PlacedFeature> SKYRIS_TREES = PlacedFeaturesUtil.createPlacedFeature("skyris_trees", BWGOverworldTreeConfiguredFeatures.SKYRIS_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(1, 0.25F, 2)));
    public static final ResourceKey<PlacedFeature> SPARSE_BLUE_SPRUCE_TREES = PlacedFeaturesUtil.createPlacedFeature("sparse_blue_spruce_trees", BWGOverworldTreeConfiguredFeatures.BLUE_SPRUCE_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(0, 0.2F, 2)));
    public static final ResourceKey<PlacedFeature> ORCHARD_TREES = PlacedFeaturesUtil.createPlacedFeature("orchard_trees", BWGOverworldTreeConfiguredFeatures.ORCHARD_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(1, 0.2F, 1)));
    public static final ResourceKey<PlacedFeature> TEMPERATE_RAINFOREST_TREES = PlacedFeaturesUtil.createPlacedFeature("temperate_rainforest_trees", BWGOverworldTreeConfiguredFeatures.TEMPERATE_RAINFOREST_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(1, 0.25F, 1)));
    public static final ResourceKey<PlacedFeature> FORGOTTEN_FOREST_TREES = PlacedFeaturesUtil.createPlacedFeature("forgotten_forest_trees", BWGOverworldTreeConfiguredFeatures.FORGOTTEN_FOREST_TREES, () -> VegetationPlacements.treePlacement(PlacementUtils.countExtra(12, 0.25F, 1)));
    public static final ResourceKey<PlacedFeature> OVERGROWTH_WOODLANDS_TREES = PlacedFeaturesUtil.createPlacedFeature("overgrowth_woodlands_trees", BWGOverworldTreeConfiguredFeatures.OVERGROWTH_WOODLANDS_TREES, () -> VegetationPlacements.treePlacement(PlacementUtils.countExtra(6, 0.25F, 1)));
    public static final ResourceKey<PlacedFeature> MEADOW_TREES = PlacedFeaturesUtil.createPlacedFeature("meadow_trees", BWGOverworldTreeConfiguredFeatures.MEADOW_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(2, 0.25F, 3)));
    public static final ResourceKey<PlacedFeature> SPARSE_MEADOW_TREES = PlacedFeaturesUtil.createPlacedFeature("sparse_meadow_trees", BWGOverworldTreeConfiguredFeatures.MEADOW_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(0, 0.25F, 1)));
    public static final ResourceKey<PlacedFeature> MEADOW_SHRUBS = PlacedFeaturesUtil.createPlacedFeature("meadow_shrubs", BWGOverworldTreeConfiguredFeatures.MEADOW_SHRUBS, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(0, 0.1F, 2)));
    public static final ResourceKey<PlacedFeature> YUCCA_TREES = PlacedFeaturesUtil.createPlacedFeature("yucca_tree", BWGOverworldTreeConfiguredFeatures.YUCCA_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(1, 0.2F, 2)));
    public static final ResourceKey<PlacedFeature> CIKA_TREES = PlacedFeaturesUtil.createPlacedFeature("cika_trees", BWGOverworldTreeConfiguredFeatures.CIKA_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(2, 0.25F, 2)));
    public static final ResourceKey<PlacedFeature> SPARSE_SPRUCE_TREES= PlacedFeaturesUtil.createPlacedFeature("sparse_spruce_trees", BWGOverworldTreeConfiguredFeatures.SPRUCE_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(1, 0.2F, 1)));
    public static final ResourceKey<PlacedFeature> SPARSE_RED_SPRUCE_TREES= PlacedFeaturesUtil.createPlacedFeature("sparse_red_spruce_trees", BWGOverworldTreeConfiguredFeatures.RED_SPRUCE_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(0, 0.1F, 1)));
    public static final ResourceKey<PlacedFeature> SPARSE_ORANGE_SPRUCE_TREES= PlacedFeaturesUtil.createPlacedFeature("sparse_orange_spruce_trees", BWGOverworldTreeConfiguredFeatures.ORANGE_SPRUCE_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(0, 0.1F, 1)));
    public static final ResourceKey<PlacedFeature> BLUE_SPRUCE_TREES = PlacedFeaturesUtil.createPlacedFeature("blue_spruce_trees", BWGOverworldTreeConfiguredFeatures.BLUE_SPRUCE_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(2, 0.1F, 1)));
    public static final ResourceKey<PlacedFeature> CONIFER_TREES = PlacedFeaturesUtil.createPlacedFeature("conifer_trees", BWGOverworldTreeConfiguredFeatures.CONIFER_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(7, 0.25F, 3)));
    public static final ResourceKey<PlacedFeature> GIANT_ALLIUMS = PlacedFeaturesUtil.createPlacedFeature("giant_alliums", BWGOverworldTreeConfiguredFeatures.GIANT_ALLIUMS, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(1, 0.25F, 1)));
    public static final ResourceKey<PlacedFeature> FLORUS_TREES = PlacedFeaturesUtil.createPlacedFeature("florus_trees", BWGOverworldTreeConfiguredFeatures.FLORUS_TREES, () -> VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2F, 1)));
    public static final ResourceKey<PlacedFeature> TEMPERATE_GROVE_TREES = PlacedFeaturesUtil.createPlacedFeature("temperate_grove_trees", BWGOverworldTreeConfiguredFeatures.TEMPERATE_GROVE_TREES, () -> VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.2F, 2)));
    public static final ResourceKey<PlacedFeature> MAPLE_TAIGA_TREES = PlacedFeaturesUtil.createPlacedFeature("maple_taiga_trees", BWGOverworldTreeConfiguredFeatures.MAPLE_TAIGA_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(4, 0.25F, 2)));
    public static final ResourceKey<PlacedFeature> ASPEN_SHRUBS = PlacedFeaturesUtil.createPlacedFeature("aspen_shrubs", BWGOverworldTreeConfiguredFeatures.ASPEN_SHRUBS, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(0, 0.25F, 2)));
    public static final ResourceKey<PlacedFeature> ASPEN_TREES = PlacedFeaturesUtil.createPlacedFeature("aspen_trees", BWGOverworldTreeConfiguredFeatures.ASPEN_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(5, 0.25F, 3)));
    public static final ResourceKey<PlacedFeature> ASPEN_TREES_SPARSE = PlacedFeaturesUtil.createPlacedFeature("aspen_trees_sparse", BWGOverworldTreeConfiguredFeatures.ASPEN_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(0, 0.25F, 1)));
    public static final ResourceKey<PlacedFeature> BLACK_FOREST_TREES = PlacedFeaturesUtil.createPlacedFeature("black_forest_trees", BWGOverworldTreeConfiguredFeatures.BLACK_FOREST_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(8, 0.2F, 2)));
    public static final ResourceKey<PlacedFeature> GUIANA_SHIELD_TREES = PlacedFeaturesUtil.createPlacedFeature("guiana_shield_trees", BWGOverworldTreeConfiguredFeatures.GUIANA_SHIELD_TREES, () -> VegetationPlacements.treePlacement(PlacementUtils.countExtra(15, 0.25F, 1)));
    public static final ResourceKey<PlacedFeature> CANADIAN_SHIELD_TREES = PlacedFeaturesUtil.createPlacedFeature("canadian_shield_trees", BWGOverworldTreeConfiguredFeatures.CANADIAN_SHIELD_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(4, 0.25F, 2)));
    public static final ResourceKey<PlacedFeature> SPARSE_OAK_TREES = PlacedFeaturesUtil.createPlacedFeature("sparse_oak_trees", BWGOverworldTreeConfiguredFeatures.OAK_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(0, 0.1F, 1)));
    public static final ResourceKey<PlacedFeature> BWG_OAK_TREES = PlacedFeaturesUtil.createPlacedFeature("bwg_oak_trees", BWGOverworldTreeConfiguredFeatures.OAK_TREES, () -> VegetationPlacements.treePlacement(PlacementUtils.countExtra(12, 0.25F, 1)));

    public static final ResourceKey<PlacedFeature> PRAIRIE_SHRUBS = PlacedFeaturesUtil.createPlacedFeature("prairie_shrubs", BWGOverworldTreeConfiguredFeatures.PRAIRIE_SHRUBS, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(0, 0.25F, 2)));
    public static final ResourceKey<PlacedFeature> ZELKOVA_TREES = PlacedFeaturesUtil.createPlacedFeature("zelkova_trees", BWGOverworldTreeConfiguredFeatures.ZELKOVA_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(5, 0.2F, 2)));
    public static final ResourceKey<PlacedFeature> PALO_VERDE_TREES = PlacedFeaturesUtil.createPlacedFeature("palo_verde_trees", BWGOverworldTreeConfiguredFeatures.PALO_VERDE_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(0, 0.2F, 1)));
    public static final ResourceKey<PlacedFeature> FRAGMENT_JUNGLE_TREES = PlacedFeaturesUtil.createPlacedFeature("fragment_jungle_trees", BWGOverworldTreeConfiguredFeatures.FRAGMENT_JUNGLE_TREES, () -> VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.25F, 2)));
    public static final ResourceKey<PlacedFeature> SPRUCE_TREES = PlacedFeaturesUtil.createPlacedFeature("spruce_trees", BWGOverworldTreeConfiguredFeatures.SPRUCE_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(3,0.2F, 1)));
    public static final ResourceKey<PlacedFeature> REDWOOD_TREES = PlacedFeaturesUtil.createPlacedFeature("redwood_trees", BWGOverworldTreeConfiguredFeatures.REDWOOD_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(2, 0.2F, 2)));
    public static final ResourceKey<PlacedFeature> DACITE_RIDGE_TREES = PlacedFeaturesUtil.createPlacedFeature("dacite_ridge_trees", BWGOverworldTreeConfiguredFeatures.DACITE_RIDGE_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(1, 0.25F, 2)));
    public static final ResourceKey<PlacedFeature> HOLLY_TREES = PlacedFeaturesUtil.createPlacedFeature("holly_trees", BWGOverworldTreeConfiguredFeatures.HOLLY_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(4, 0.25F, 4)));
    public static final ResourceKey<PlacedFeature> JACARANDA_TREES = PlacedFeaturesUtil.createPlacedFeature("jacaranda_trees", BWGOverworldTreeConfiguredFeatures.JACARANDA_TREES, () -> VegetationPlacements.treePlacement(PlacementUtils.countExtra(13, 0.25F, 4)));
    public static final ResourceKey<PlacedFeature> SPARSE_BWG_BIRCH_TREES = PlacedFeaturesUtil.createPlacedFeature("sparse_bwg_birch_trees", BWGOverworldTreeConfiguredFeatures.BIRCH_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(1, 0.25F, 2)));
    public static final ResourceKey<PlacedFeature> BWG_BIRCH_TREES = PlacedFeaturesUtil.createPlacedFeature("bwg_birch_trees", BWGOverworldTreeConfiguredFeatures.BIRCH_TREES, () -> VegetationPlacements.treePlacement(PlacementUtils.countExtra(12, 0.25F, 1)));

    public static final ResourceKey<PlacedFeature> WHITE_SAKURA_TREES = PlacedFeaturesUtil.createPlacedFeature("white_sakura_trees", BWGOverworldTreeConfiguredFeatures.WHITE_SAKURA_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(2, 0.2F, 2)));
    public static final ResourceKey<PlacedFeature> YELLOW_SAKURA_TREES = PlacedFeaturesUtil.createPlacedFeature("yellow_sakura_trees", BWGOverworldTreeConfiguredFeatures.YELLOW_SAKURA_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(2, 0.2F, 2)));
    public static final ResourceKey<PlacedFeature> EBONY_TREES = PlacedFeaturesUtil.createPlacedFeature("ebony_trees", BWGOverworldTreeConfiguredFeatures.EBONY_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(4, 0.25F, 4)));
    public static final ResourceKey<PlacedFeature> HAZEL_TREES = PlacedFeaturesUtil.createPlacedFeature("hazel_trees", BWGOverworldTreeConfiguredFeatures.WITCH_HAZEL_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(4, 0.25F, 2)));
    public static final ResourceKey<PlacedFeature> PALM_TREES = PlacedFeaturesUtil.createPlacedFeature("palm_trees", BWGOverworldTreeConfiguredFeatures.PALM_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(0, 0.1F, 1)));
    public static final ResourceKey<PlacedFeature> ORANGE_BIRCH_TREES = PlacedFeaturesUtil.createPlacedFeature("orange_birch_trees", BWGOverworldTreeConfiguredFeatures.ORANGE_BIRCH_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(1, 0.2F, 1)));
    public static final ResourceKey<PlacedFeature> YELLOW_BIRCH_TREES = PlacedFeaturesUtil.createPlacedFeature("yellow_birch_trees", BWGOverworldTreeConfiguredFeatures.YELLOW_BIRCH_TREES, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(1, 0.2F, 1)));
    public static final ResourceKey<PlacedFeature> RAINFOREST_TREES = PlacedFeaturesUtil.createPlacedFeature("rainforest_trees", BWGOverworldTreeConfiguredFeatures.RAINFOREST_TREES, () -> VegetationPlacements.treePlacement(PlacementUtils.countExtra(15, 0.25F, 1)));
    public static final ResourceKey<PlacedFeature> MANGROVE_TREES = PlacedFeaturesUtil.createPlacedFeature("white_mangrove_trees", BWGOverworldTreeConfiguredFeatures.MANGROVE_TREES, PlacedFeaturesUtil.treePlacementBaseOceanFloor(OptionalInt.of(5), PlacementUtils.countExtra(8, 0.25F, 1)));
    public static final ResourceKey<PlacedFeature> CYPRESS_TREES = PlacedFeaturesUtil.createPlacedFeature("cypress_trees", BWGOverworldTreeConfiguredFeatures.CYPRESS_TREES, PlacedFeaturesUtil.treePlacementBaseOceanFloor(PlacementUtils.countExtra(2, 0.25F, 1)));
    public static final ResourceKey<PlacedFeature> BAYOU_TREES = PlacedFeaturesUtil.createPlacedFeature("bayou_trees", BWGOverworldTreeConfiguredFeatures.BAYOU_TREES, PlacedFeaturesUtil.treePlacementBaseOceanFloor(PlacementUtils.countExtra(4, 0.2F, 2), RandomOffsetPlacement.vertical(BiasedToBottomInt.of(3, 5))));
    public static final ResourceKey<PlacedFeature> OAK_TREES_SWAMP = PlacedFeaturesUtil.createPlacedFeature("oak_trees_swamp", BWGOverworldTreeConfiguredFeatures.OAK_TREES, PlacedFeaturesUtil.treePlacementBaseOceanFloor(PlacementUtils.countExtra(0, 0.2F, 1), RarityFilter.onAverageOnceEvery(2)));
    public static final ResourceKey<PlacedFeature> ENCHANTED_TREES = PlacedFeaturesUtil.createPlacedFeature("enchanted_trees", BWGOverworldTreeConfiguredFeatures.ENCHANTED_TREES, () -> VegetationPlacements.treePlacement(PlacementUtils.countExtra(15, 0.25F, 3)));
    public static final ResourceKey<PlacedFeature> SPARSE_ENCHANTED_TREES = PlacedFeaturesUtil.createPlacedFeature("sparse_enchanted_trees", BWGOverworldTreeConfiguredFeatures.ENCHANTED_TREES, () -> VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.25F, 3)));


    public static final ResourceKey<PlacedFeature> FIRECRACKER_SHRUBS = PlacedFeaturesUtil.createPlacedFeature("firecracker_shrubs", BWGOverworldTreeConfiguredFeatures.FIRECRACKER_SHRUBS, PlacedFeaturesUtil.clearingTreePlacement(PlacementUtils.countExtra(1, 0.25F, 2)));
    public static final ResourceKey<PlacedFeature> CRAG_BUSHES = PlacedFeaturesUtil.createPlacedFeature("crag_bushes", BWGOverworldTreeConfiguredFeatures.JUNGLE_BUSH1, () -> VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.25F, 2)));

    protected static void init() {
        BiomesWeveGone.LOGGER.info("Creating and Registering Overworld Tree Placed Features");
    }
}
